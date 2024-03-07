package de.tum.in.www1.artemis.service.connectors.bitbucket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Deprecated(forRemoval = true) // will be removed in 7.0.0
public record BitbucketDefaultBranchDTO(String id, String displayId, String type, String latestCommit) {
}
