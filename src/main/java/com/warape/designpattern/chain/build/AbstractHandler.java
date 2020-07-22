package com.warape.designpattern.chain.build;

import com.warape.designpattern.chain.Member;

/**
 * @author wan
 */
public abstract class AbstractHandler {
    protected AbstractHandler next;

    public void next(AbstractHandler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static Builder<?> builder() {
        return new AbstractHandler.Builder<>();
    }

    public static class Builder<T extends AbstractHandler> {
        private AbstractHandler head;
        private AbstractHandler tail;

        public Builder<T> addHandler(AbstractHandler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public AbstractHandler build() {
            return this.head;
        }

    }
}
