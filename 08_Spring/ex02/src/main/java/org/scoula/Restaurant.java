package org.scoula;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor // final 붙은 멤버만 매개변수로 받는 생성자임
public class Restaurant {
    //    @Autowired //외부에서 주입해서 자동으로 연결하겠다는 의미
    final private Chef chef; //Spring Context에 Chef라는 bean이 등록되어있어야 자동으로 연결됨

    // Restaurant(Chef chef);
}
