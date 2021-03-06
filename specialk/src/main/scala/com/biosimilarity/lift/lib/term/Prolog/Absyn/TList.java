package com.biosimilarity.lift.lib.term.Prolog.Absyn; // Java Package generated by the BNF Converter.

public class TList extends Term {
  public final Lyst lyst_;

  public TList(Lyst p1) { lyst_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.term.Prolog.Absyn.Term.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.term.Prolog.Absyn.TList) {
      com.biosimilarity.lift.lib.term.Prolog.Absyn.TList x = (com.biosimilarity.lift.lib.term.Prolog.Absyn.TList)o;
      return this.lyst_.equals(x.lyst_);
    }
    return false;
  }

  public int hashCode() {
    return this.lyst_.hashCode();
  }


}
