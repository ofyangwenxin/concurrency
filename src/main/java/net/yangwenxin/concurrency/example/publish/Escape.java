package net.yangwenxin.concurrency.example.publish;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.concurrency.annotation.NotRecommend;
import net.yangwenxin.concurrency.annotation.NotThreadSafe;

@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape() {
        new InnerClass();
    }

    private class InnerClass {
        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }

}
