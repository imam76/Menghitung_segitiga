// Generated code from Butter Knife. Do not modify!
package com.example.root.alat_hitung;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165221;

  private View view2131165225;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.iTinggi = Utils.findRequiredViewAsType(source, R.id.tinggi, "field 'iTinggi'", EditText.class);
    target.iAlas = Utils.findRequiredViewAsType(source, R.id.alas, "field 'iAlas'", EditText.class);
    view = Utils.findRequiredView(source, R.id.cari, "field 'cari' and method 'onViewClicked'");
    target.cari = Utils.castView(view, R.id.cari, "field 'cari'", Button.class);
    view2131165221 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.clear, "field 'clear' and method 'onViewClicked'");
    target.clear = Utils.castView(view, R.id.clear, "field 'clear'", Button.class);
    view2131165225 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.hasilKeliling = Utils.findRequiredViewAsType(source, R.id.hasilKeliling, "field 'hasilKeliling'", TextView.class);
    target.hasilLuas = Utils.findRequiredViewAsType(source, R.id.hasilLuas, "field 'hasilLuas'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.iTinggi = null;
    target.iAlas = null;
    target.cari = null;
    target.clear = null;
    target.hasilKeliling = null;
    target.hasilLuas = null;

    view2131165221.setOnClickListener(null);
    view2131165221 = null;
    view2131165225.setOnClickListener(null);
    view2131165225 = null;
  }
}
