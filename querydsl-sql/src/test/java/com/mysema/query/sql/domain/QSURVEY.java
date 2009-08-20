/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.sql.domain;

import com.mysema.query.types.path.PEntity;
import com.mysema.query.types.path.PNumber;
import com.mysema.query.types.path.PString;
import com.mysema.query.types.path.PathMetadata;
import com.mysema.query.util.NotEmpty;

public class QSURVEY extends PEntity<java.lang.Object> {
    public final PString name = _string("name");
    public final PNumber<java.lang.Integer> id = _number("id",
            java.lang.Integer.class);

    public QSURVEY(@NotEmpty java.lang.String path) {
        super(java.lang.Object.class, "survey", path);
    }

    public QSURVEY(PathMetadata<?> metadata) {
        super(java.lang.Object.class, "survey", metadata);
    }
}