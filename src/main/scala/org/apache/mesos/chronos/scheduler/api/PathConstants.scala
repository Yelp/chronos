package org.apache.mesos.chronos.scheduler.api

/**
 * @author Florian Leibert (flo@leibert.de)
 */
object PathConstants {

  /*
   *  scheduler api
   */
  final val iso8601JobPath = "scheduler/iso8601"
  final val dependentJobPath = "scheduler/dependency"


  final val jobBasePath = "scheduler/"
  final val allJobsPath = "jobs/"
  final val jobSearchPath = "jobs/search"
  final val jobPatternPath = "job/{jobName}"

  final val jobStatsPatternPath = "job/stat/{jobName}"
  final val jobTaskProgressPath = "job/{jobName}/task/{taskId}/progress"
  final val jobSuccessPath = "job/success/{jobName}"

  final val allStatsPath = "scheduler/stats/{percentile}"
  final val graphBasePath = "scheduler/graph/"
  final val jobGraphDotPath = "dot"
  final val jobGraphCsvPath = "csv"

  final val taskBasePath = "/scheduler/task/"
  final val killTaskPattern = "kill/{jobName}"
  final val getLeaderPattern = "/leader"

  final val isMasterPath = "isMaster"
  final val infoPath = "info"
  final val leaderPath = "leader"
  final val uriTemplate = "http://%s%s"
}
