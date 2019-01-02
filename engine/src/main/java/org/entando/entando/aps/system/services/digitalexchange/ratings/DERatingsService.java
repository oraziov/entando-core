package org.entando.entando.aps.system.services.digitalexchange.ratings;

import org.entando.entando.aps.system.services.digitalexchange.model.DERatingsSummary;
import org.entando.entando.web.common.model.PagedRestResponse;
import org.entando.entando.web.digitalexchange.ratings.DERating;

import java.util.Optional;

public interface DERatingsService {
    PagedRestResponse<DERatingsSummary> getAllRatingsSummaries();

    Optional<DERatingsSummary> getComponentRatingsSummary(String componentId);

    Optional<DERatingsSummary> addRating(DERating deRatingUpdate);
}