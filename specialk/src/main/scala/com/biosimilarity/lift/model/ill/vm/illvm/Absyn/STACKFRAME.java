package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public class STACKFRAME extends Frame {
  public final Stack stack_;
  public final Env env_;
  public final ILLCode illcode_;

  public STACKFRAME(Stack p1, Env p2, ILLCode p3) { stack_ = p1; env_ = p2; illcode_ = p3; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.Frame.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.STACKFRAME) {
      com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.STACKFRAME x = (com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.STACKFRAME)o;
      return this.stack_.equals(x.stack_) && this.env_.equals(x.env_) && this.illcode_.equals(x.illcode_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.stack_.hashCode())+this.env_.hashCode())+this.illcode_.hashCode();
  }


}