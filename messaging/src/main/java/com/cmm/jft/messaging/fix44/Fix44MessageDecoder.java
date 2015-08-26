/**
 * 
 */
package com.cmm.jft.messaging.fix44;

import quickfix.FieldNotFound;
import quickfix.Message;
import quickfix.field.ExecType;
import quickfix.fix44.ExecutionReport;
import quickfix.fix44.OrderCancelReject;
import quickfix.fix44.OrderCancelReplaceRequest;
import quickfix.fix44.OrderCancelRequest;

import org.apache.log4j.Level;

import com.cmm.jft.messaging.MessageDecoder;
import com.cmm.jft.trading.OrderEvent;
import com.cmm.jft.trading.Orders;
import com.cmm.jft.trading.enums.ExecutionTypes;
import com.cmm.jft.trading.enums.OrderTypes;
import com.cmm.jft.trading.enums.Side;
import com.cmm.jft.trading.securities.Security;
import com.cmm.jft.trading.services.SecurityService;
import com.cmm.logging.Logging;

/**
 * <p><code>Fix44MessageDecoder.java</code> </p>
 * @author Cristiano M Martins
 * @version 11/08/2015 13:49:32
 */
public class Fix44MessageDecoder implements MessageDecoder {

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#heartbeat()
	 */
	@Override
	public Message heartbeat() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#logon(java.lang.String, boolean, java.lang.String)
	 */
	@Override
	public Message logon(String authData, boolean resetSeqNum,
			String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#logout(java.lang.String)
	 */
	@Override
	public Message logout(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#reject(int)
	 */
	@Override
	public Message reject(int refMsgSeqNum) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#resendRequest(int, int)
	 */
	@Override
	public Message resendRequest(int beginSeqNum, int endSeqNum) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#sequenceReset()
	 */
	@Override
	public Message sequenceReset() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#testRequest()
	 */
	@Override
	public Message testRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#allocationInstruction(quickfix.Message)
	 */
	@Override
	public Message allocationInstruction(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#allocationReport(quickfix.Message)
	 */
	@Override
	public Message allocationReport(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#businessMessageReject(quickfix.Message)
	 */
	@Override
	public Message businessMessageReject(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#executionReport(quickfix.Message)
	 */

	public OrderEvent executionReport(Message message) {
		OrderEvent event = null;

		if(message instanceof ExecutionReport) {
			ExecutionReport er = (ExecutionReport) message;

			try {
				event = new OrderEvent(
						ExecutionTypes.getByValue(er.getExecType().getValue()), 
						er.getTransactTime().getValue(), 
						er.getOrderQty().getValue(), er.getPrice().getValue()
						);
			}catch(FieldNotFound e) {

			}

		}

		return event;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#newOrderCross(quickfix.Message)
	 */
	@Override
	public Orders newOrderCross(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#newOrderSingle(quickfix.Message)
	 */
	@Override
	public Orders newOrderSingle(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#orderCancelReject(quickfix.Message)
	 */
	@Override
	public OrderEvent orderCancelReject(Message message) {
		OrderCancelReject cancelReject = (OrderCancelReject) message;
		OrderEvent event = new OrderEvent(); 

		// TODO Auto-generated method stub
		return event;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#orderCancelReplaceRequest(quickfix.Message)
	 */
	@Override
	public Orders orderCancelReplaceRequest(Message message) {

		OrderCancelReplaceRequest request = (OrderCancelReplaceRequest) message;
		Orders ordr = new Orders();
		try{
			ordr.setClOrdID(request.getClOrdID().getValue());
			ordr.setOrigClOrdID(request.getOrigClOrdID().getValue());
			ordr.setMaxFloor(request.getMaxFloor().getValue());
			ordr.setSecurityID(SecurityService.getInstance().provideSecurity(request.getSymbol().getValue()));
			ordr.setSide(Side.getByValue(request.getSide().getValue()));
			ordr.setVolume(request.getOrderQty().getValue());
			ordr.setOrderType(OrderTypes.getByValue(request.getOrdType().getValue()));
			ordr.setPrice(request.getPrice().getValue());
			ordr.setStopPrice(request.getStopPx().getValue());
		}catch(FieldNotFound e){
			Logging.getInstance().log(getClass(), e, Level.ERROR);
		}

		return ordr;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#orderCancelRequest(quickfix.Message)
	 */
	@Override
	public Orders orderCancelRequest(Message message) {
		OrderCancelRequest request = (OrderCancelRequest) message;
		Orders ordr = new Orders();
		try{
			ordr.setClOrdID(request.getClOrdID().getValue());
			ordr.setOrigClOrdID(request.getOrigClOrdID().getValue());
			ordr.setSecurityID(SecurityService.getInstance().provideSecurity(request.getSymbol().getValue()));
			ordr.setSide(Side.getByValue(request.getSide().getValue()));
			ordr.setVolume(request.getOrderQty().getValue());
		}catch(FieldNotFound e){
			Logging.getInstance().log(getClass(), e, Level.ERROR);
		}

		return ordr;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#positionMaintenanceReport(quickfix.Message)
	 */
	@Override
	public Message positionMaintenanceReport(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#positionMaintenanceRequest(quickfix.Message)
	 */
	@Override
	public Message positionMaintenanceRequest(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#quote(quickfix.Message)
	 */
	@Override
	public Message quote(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#quoteCancel(quickfix.Message)
	 */
	@Override
	public Message quoteCancel(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#quoteRequest(quickfix.Message)
	 */
	@Override
	public Message quoteRequest(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#quoteRequestReject(quickfix.Message)
	 */
	@Override
	public Message quoteRequestReject(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#quoteStatusReport(quickfix.Message)
	 */
	@Override
	public Message quoteStatusReport(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#securityDefinition(quickfix.Message)
	 */
	@Override
	public Message securityDefinition(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cmm.jft.engine.message.MessageDecoder#securityDefinitionRequest(quickfix.Message)
	 */
	@Override
	public Message securityDefinitionRequest(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

}