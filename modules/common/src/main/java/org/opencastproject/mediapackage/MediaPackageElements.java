/**
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 *
 * The Apereo Foundation licenses this file to you under the Educational
 * Community License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at:
 *
 *   http://opensource.org/licenses/ecl2.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */


package org.opencastproject.mediapackage;

/**
 * Contains all well-known definitions, names and symbols REPLAY relies on as constants for an easy usage and as a
 * documentation.
 */
public interface MediaPackageElements {

  /** The manifest file name */
  String MANIFEST_FILENAME = "index.xml";

  /** Cover art flavor */
  MediaPackageElementFlavor MEDIAPACKAGE_COVER_FLAVOR = new MediaPackageElementFlavor("cover", "source", "Cover art");

  // Track flavors

  /** Track containing the presenter/s */
  MediaPackageElementFlavor PRESENTER_SOURCE = new MediaPackageElementFlavor("presenter", "source");

  /** Track containing presentational material */
  MediaPackageElementFlavor PRESENTATION_SOURCE = new MediaPackageElementFlavor("presentation", "source");

  /** Track containing the presenter/s partial material */
  MediaPackageElementFlavor PRESENTER_SOURCE_PARTIAL = new MediaPackageElementFlavor("presenter", "source+partial");

  /** Track containing presentational partial material */
  MediaPackageElementFlavor PRESENTATION_SOURCE_PARTIAL = new MediaPackageElementFlavor("presentation",
          "source+partial");

  /** Track capturing the audience */
  MediaPackageElementFlavor AUDIENCE_SOURCE = new MediaPackageElementFlavor("audience", "source");

  /** Track capturing the contents of a document camera */
  MediaPackageElementFlavor DOCUMENTS_SOURCE = new MediaPackageElementFlavor("documents", "source");

  /** Track without any known semantics */
  MediaPackageElementFlavor INDEFINITE_SOURCE = new MediaPackageElementFlavor("indefinite", "source");

  // Dublin core catalog flavors

  /** Dublin core catalog describing an episode */
  MediaPackageElementFlavor EPISODE = new MediaPackageElementFlavor("dublincore", "episode");

  /** Dublin core catalog describing a series */
  MediaPackageElementFlavor SERIES = new MediaPackageElementFlavor("dublincore", "series");

  // Mpeg-7 catalog flavors

  /** The flavor produced by video segmentation */
  MediaPackageElementFlavor SEGMENTS = new MediaPackageElementFlavor("mpeg-7", "segments");

  /** The flavor produced by text extraction */
  MediaPackageElementFlavor TEXTS = new MediaPackageElementFlavor("mpeg-7", "text");

  /** The flavor produced by speech recognition */
  MediaPackageElementFlavor SPEECH = new MediaPackageElementFlavor("mpeg-7", "speech");

  /** A flavor for chapters */
  MediaPackageElementFlavor CHAPTERING = new MediaPackageElementFlavor("mpeg-7", "chapter", "MPEG-7 chapters catalog");

  // Engage flavors

  /** Presenter player preview image flavor */
  MediaPackageElementFlavor PRESENTER_PLAYER_PREVIEW = new MediaPackageElementFlavor("presenter", "player+preview",
          "Presenter player preview image");

  /** Presentation player preview image flavor */
  MediaPackageElementFlavor PRESENTATION_PLAYER_PREVIEW = new MediaPackageElementFlavor("presentation",
          "player+preview", "Presentation player preview image");

  /** Presenter search result preview image flavor */
  MediaPackageElementFlavor PRESENTER_SEARCHRESULT_PREVIEW = new MediaPackageElementFlavor("presenter",
          "search+preview", "Presenter search result preview image");

  /** Presentation search result preview image flavor */
  MediaPackageElementFlavor PRESENTATION_SEARCHRESULT_PREVIEW = new MediaPackageElementFlavor("presentation",
          "search+preview", "Presentation search result preview image");

  /** Presenter segment preview image flavor */
  MediaPackageElementFlavor PRESENTER_SEGMENT_PREVIEW = new MediaPackageElementFlavor("presenter", "segment+preview",
          "Presenter segment preview image");

  /** Presentation segment preview image flavor */
  MediaPackageElementFlavor PRESENTATION_SEGMENT_PREVIEW = new MediaPackageElementFlavor("presentation",
          "segment+preview", "Presentation segment preview image");

  // Feed flavors

  /** Presenter feed preview image flavor */
  MediaPackageElementFlavor PRESENTER_FEED_PREVIEW = new MediaPackageElementFlavor("presenter", "feed+preview",
          "Presenter feed preview image");

  /** Presentation feed preview image flavor */
  MediaPackageElementFlavor PRESENTATION_FEED_PREVIEW = new MediaPackageElementFlavor("presentation", "feed+preview",
          "Presentation feed preview image");

  // Security flavors

  /** Episode bound XACML policy flavor */
  MediaPackageElementFlavor XACML_POLICY_EPISODE = new MediaPackageElementFlavor("security", "xacml+episode",
          "Security policy for the mediapackage");

  /** Series bound XACML policy flavor */
  MediaPackageElementFlavor XACML_POLICY_SERIES = new MediaPackageElementFlavor("security", "xacml+series",
          "Security policy for the series");

  /**
   * XACML policy flavor.
   *
   * @deprecated use {@link #XACML_POLICY_SERIES} instead.
   */
  @Deprecated
  MediaPackageElementFlavor XACML_POLICY = new MediaPackageElementFlavor("security", "xacml",
          "Security policy for the mediapackage");

  /** Export Files Policy flavor */
  MediaPackageElementFlavor EXPORT_POLICY = new MediaPackageElementFlavor("security", "acl",
          "Security policy for the export files");

  // Other flavors

  /** A default flavor for caption files */
  MediaPackageElementFlavor CAPTION_GENERAL = new MediaPackageElementFlavor("captions", "timedtext",
          "DFXP Captions catalog");

  /** A flavor for DFXP caption files */
  MediaPackageElementFlavor CAPTION_DFXP_FLAVOR = new MediaPackageElementFlavor("caption", "dfxp",
          "DFXP Captions catalog");

  /** OAI-PMH subtype flavor */
  MediaPackageElementFlavor OAIPMH = new MediaPackageElementFlavor("*", "oaipmh");

  /** Comments metadata flavor */
  MediaPackageElementFlavor COMMENTS = new MediaPackageElementFlavor("metadata", "comments");

  /** Notes metadata flavor */
  MediaPackageElementFlavor NOTES = new MediaPackageElementFlavor("metadata", "notes");

  /** Partial SMIL flavor */
  MediaPackageElementFlavor SMIL = new MediaPackageElementFlavor("smil", "source+partial");

  /** Processing properties flavor */
  MediaPackageElementFlavor PROCESSING_PROPERTIES = new MediaPackageElementFlavor("processing", "defaults");

}
