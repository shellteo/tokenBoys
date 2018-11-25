package com.util;

import io.ipfs.api.IPFS;
import io.ipfs.api.MerkleNode;
import io.ipfs.api.NamedStreamable;

import java.io.File;
import java.io.IOException;

public class IpfsUtil {

    public static String addFile(File file) {

        try {
            IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
            ipfs.refs.local();
            NamedStreamable.FileWrapper fileWrapper = new NamedStreamable.FileWrapper(file);
            MerkleNode addResult = ipfs.add(fileWrapper).get(0);
            return addResult.hash.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
