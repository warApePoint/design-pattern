package com.warape.designpattern.chain.optimiaze;


import com.warape.designpattern.chain.Member;

public abstract class Handler {
    protected Handler next;
    public void next(Handler next){ this.next = next;}

    public abstract void doHandler(Member member);
}
