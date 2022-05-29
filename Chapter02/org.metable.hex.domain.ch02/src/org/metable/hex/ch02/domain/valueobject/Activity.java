package org.metable.hex.ch02.domain.valueobject;

public final class Activity {

    private final String srcHost;

    private final String dstHost;
    public Activity(String srcHost, String dstHost) {
        this.srcHost = srcHost;
        this.dstHost = dstHost;
    }

    public String getDestHost() {
        return dstHost;
    }

    public String getSourceHost() {
        return srcHost;
    }

    @Override
    public String toString() {
        return "Activity [srcHost=" + srcHost + ", dstHost=" + dstHost + "]";
    }
}
