package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {

    public void excute(Callback callback) {
        long starttime = System.currentTimeMillis();

        //비즈니스 로직 실행
        callback.call();
        //비즈니스 로직 종료

        long endTime = System.currentTimeMillis();
        long resultTIme = endTime - starttime;
        log.info("resultTime={}", resultTIme);
    }

}
