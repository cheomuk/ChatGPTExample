package com.app.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGptRequest implements Serializable {

    private String model;   // 데이터를 예측하는 데 사용되는 text-davinci-002 사용 중
    private String prompt;  // 모델이 예측할 때 시작 문장이나 단어를 지정하는 역할
    private Double temperature; // 모델 출력의 임의성 또는 창의성을 제어하는 하이퍼 매개변수

    @JsonProperty("max_tokens")
    private Integer maxTokens;  // 모델에서 생성되는 최대 토큰 수를 지정하는 데 사용

    @JsonProperty("top_p")
    private Double topP;    // 추론 시간 동안 샘플링 임계값을 지정하는 역할
}




