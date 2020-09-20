package vip.mate.core.rocketmq.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import vip.mate.core.rocketmq.constant.MessageConstant;

/**
 * 消费者Channel
 *
 * @author pangu
 */
public interface MateSink {

	/**
	 * 短消息消费者
	 *
	 * @return SubscribableChannel
	 */
	@Input(MessageConstant.SMS_MESSAGE_INPUT)
	SubscribableChannel smsInput();

	/**
	 * 邮件消费者
	 *
	 * @return SubscribableChannel
	 */
	@Input(MessageConstant.EMAIL_MESSAGE_INPUT)
	SubscribableChannel emailInput();
}