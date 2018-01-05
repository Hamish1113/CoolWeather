package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yejuan on 2018/1/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
