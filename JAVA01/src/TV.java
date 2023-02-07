public class TV {

  String productCompany;
  int productYear;
  int productInch;

  public TV() {
    productCompany = "LG";
    productYear = 2017;
    productInch = 32;
  }

  public TV(String _productCompany, int _productYear, int _productInch) {
    productCompany = _productCompany;
    productYear = _productYear;
    productInch = _productInch;
  }

  void show() {
    System.out.println(
      productCompany +
      "에서 만든 " +
      productYear +
      "년형 " +
      productInch +
      "인치 TV"
    );
  }
}
