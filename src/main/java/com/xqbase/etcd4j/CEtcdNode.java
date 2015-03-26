package com.xqbase.etcd4j;

import java.util.List;

public class CEtcdNode {

    public String key;
    public long createdIndex;
    public long modifiedIndex;
    public String value;

    // For TTL keys
    public String expiration;
    public Integer ttl;

    // For listings
    public boolean dir;
    public List<CEtcdNode> nodes;
}
