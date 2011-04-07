package edu.berkeley.cs169.bricktionary.test;

import edu.berkeley.cs169.bricktionary.Bricktionary;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class BrickTest extends ActivityInstrumentationTestCase2<Bricktionary> {
    private Bricktionary mActivity;
    private TextView mView;
    private String resourceString;
	
	
	public BrickTest() {
		super("edu.berkeley.cs169.bricktionary", Bricktionary.class);
	}
	
	@Override 
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById(edu.berkeley.cs169.bricktionary.R.id.TextView01);
        resourceString = mActivity.getString(edu.berkeley.cs169.bricktionary.R.string.hello);
	}
	
	public void testPrecondition() {
		assertNotNull(mView);
	}
}

