package online.jeweljoust.BE.Demo;

import org.springframework.stereotype.Service;

@Service
public class Demo {
    public boolean isPrimeNumber(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }
}
