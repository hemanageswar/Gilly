package Search;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.google.android.youtube:id/menu_search")
	private List<MobileElement> M1;

	@AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
	private List<MobileElement> M2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
	private List<MobileElement> M3;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private List<MobileElement> M4;

	public List<MobileElement> getM1() {
		return M1;
	}
	public List<MobileElement> getM2() {
		return M2;
	}
	public List<MobileElement> getM3() {
		return M3;
	}
	public List<MobileElement> getM4() {
		return M4;
	}
}
