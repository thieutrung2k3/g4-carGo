package org.g4.dto.response.valueObject;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * vo tương tác giữa BE và FE
 * @param <T>
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultMessage<T> implements Serializable {
    /**
     *  Số nhận dạng duy nhất của lớp trong quá trình tuần tự hoá
     */
    private static final long serialVersionUID = 1L;

    /**
     *  Cờ xác định thành công
     */
    private boolean success;

    /**
     *  Nội dung
     */
    private String message;

    /**
     *  Mã code trả về
     */
    private Integer code;

    /**
     *  Đánh dấu thời gian
     */
    private long timestamp = System.currentTimeMillis();

    /**
     *  Đối tượng kết quả
     */
    private T result;
}
