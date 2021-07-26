package io.qiot.manufacturing.commons.util.producer;

import java.time.Instant;

import javax.enterprise.context.ApplicationScoped;

import io.qiot.manufacturing.commons.domain.productline.GlobalProductLineDTO;
import io.qiot.manufacturing.commons.domain.productline.MarginsDTO;

@ApplicationScoped
public class SampleGlobalProductLineProducer extends SampleProductLineProducer {

    @Override
    public GlobalProductLineDTO generate() {
        GlobalProductLineDTO pl = new GlobalProductLineDTO();

        doGenerate(pl);
        
        pl.createdOn = Instant.now();

        pl.margins = margins();

        return pl;
    }

    private MarginsDTO margins() {
        MarginsDTO margins = new MarginsDTO();
        margins.weaving = 0.5;
        margins.coloring = 2;
        margins.printing = 0.1;
        margins.packaging = 0.1;
        return margins;
    }
}
