package io.qiot.manufacturing.all.commons.util.converter;

import java.util.List;

/**
 * @author andreabattaglia
 *
 * @param <S>
 * @param <D>
 */
public interface DataObjectConverter<S,D> {

    D sourceToDest(S src);
    
    S destToSource(D dest);

    List<D> allSourceToDest(List<S> srcs);
    
    List<S> allDestToSource(List<D> dests);
}
