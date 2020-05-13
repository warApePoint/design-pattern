package com.warape.designpattern.chain.build;

import com.warape.designpattern.chain.Member;

public abstract class Handler<T> {
    protected Handler<T> next;

    public void next(Handler<T> next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static Builder<?> builder() {
        return new Handler.Builder<>();
    }

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }

    }
}
