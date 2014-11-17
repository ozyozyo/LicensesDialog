package jp.co.mixi.maychannel.app.setting.model;

import android.content.Context;

import de.psdev.licensesdialog.licenses.License;
import jp.co.mixi.maychannel.R;

public class NewrelicLicense extends License {
    @Override
    public String getName() {
        return "New Relic Java agent license";
    }

    @Override
    public String getSummaryText(Context context) {
        return null;
    }

    @Override
    public String getFullText(Context context) {
        return getContent(context, R.raw.newrelic_license);
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public String getUrl() {
        return "https://newrelic.com/docs/java/java-agent-license";
    }
}
