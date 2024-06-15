package online.jeweljoust.BE.model;

import lombok.Getter;
import lombok.Setter;
import online.jeweljoust.BE.entity.Account;
import org.springframework.stereotype.Service;


@Service
@Getter
@Setter
public class AccountReponse extends Account {
    String token;
}
