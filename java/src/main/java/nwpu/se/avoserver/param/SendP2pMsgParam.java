package nwpu.se.avoserver.param;


import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


/**
 * 发送P2P消息
 * */
@Data
public class SendP2pMsgParam {
    /**
     * senderID: 发送者ID
     * */
    @Min(value = 10000000, message = "ID长度必须为8位")
    @Max(value = 99999999, message = "ID长度必须为8位")
    private int senderID;

    /**
     * receiverID: 接受者ID
     * */
    @Min(value = 10000000, message = "ID长度必须为8位")
    @Max(value = 99999999, message = "ID长度必须为8位")
    private int receiverID;

    /**
     * content: 消息内容
     * */
    @NotBlank
    private String content;
}
