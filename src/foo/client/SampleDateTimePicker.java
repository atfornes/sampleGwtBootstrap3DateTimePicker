package foo.client;

import org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SampleDateTimePicker implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    final DateTimePicker dtp = new DateTimePicker();

    RootPanel.get("datetimeContainer").add(dtp);


  }
}
