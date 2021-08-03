package io.qiot.manufacturing.commons.util.converter;

import java.util.List;

public interface DataObjectConverter<S,D> {

    D sourceToDest(S src);
    
    S destToSource(D dest);

    List<D> allSourceToDest(List<S> srcs);
    
    List<S> allDestToSource(List<D> dests);
}
