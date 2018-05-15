package com.testinium.web.step;

import com.testinium.web.Calculate;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class StepImpl {
  Calculate calculate;

  @Step("Create calculate service")
  public void createCalculateService() {
    calculate = new Calculate();
  }

  @Step({"Sum two number <a> and <b> expect result <c>"})
  public void sumTwoNumber(int a, int b, int c) {
    int result = calculate.sum(a, b);
    Assert.assertEquals(c, result);
  }

  @Step({"Sub two number <a> and <b> expect result <c>"})
  public void subTwoNumber(int a, int b, int c) {
    int result = calculate.sub(a, b);
    Assert.assertEquals(c, result);
  }


  @Step("Remove calculate service")
  public void removeCalculateService() {
    calculate = null;
  }
}
