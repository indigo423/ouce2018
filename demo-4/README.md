# Demo 4

Describe patterns to update 

```
# Start the service stack in background
docker-compose up -d
```

- Configuration files are persisted on the local file system in `opennms-etc`.
- Customizations in etc-overlay and jetty-webinf-overlay for authentication
- Important! Always backup configs, RRD files and database.
- You can use the Docker container images to iniatilize a directory with a specific pristine configuration
- Use the configuration tester to validate a configuration directory against any specific version

```
# Test configuration with a specific version
docker run --rm -v $(pwd):opennms-etc-21.0.3-1:/opt/opennms/etc opennms/horizon-core-web:22.0.4-1 -t -a
```

```
# Get all files which are changed from a pristine and custom configuration within a version
ls -l
opennms-etc-21.0.3-1
opennms-etc-21.0.3-1-pristine
```
# Show all files which are changed between a pristine 21.0.3 and my custom config
diff -rq -EBbw opennms-etc-21.0.3-1 opennms-etc-21.0.3-1-pristine

Files opennms-etc-21.0.3-1/categories.xml and opennms-etc-21.0.3-1-pristine/categories.xml differ
Files opennms-etc-21.0.3-1/config.properties and opennms-etc-21.0.3-1-pristine/config.properties differ
Files opennms-etc-21.0.3-1/libraries.properties and opennms-etc-21.0.3-1-pristine/libraries.properties differ
Files opennms-etc-21.0.3-1/opennms-upgrade-status.properties and opennms-etc-21.0.3-1-pristine/opennms-upgrade-status.properties differ
Only in opennms-etc-21.0.3-1: org.opennms.features.datachoices.cfg
Only in opennms-etc-21.0.3-1: pluginManifestData.xml
Files opennms-etc-21.0.3-1/snmp-config.xml and opennms-etc-21.0.3-1-pristine/snmp-config.xml differ
Files opennms-etc-21.0.3-1/thresholds.xml and opennms-etc-21.0.3-1-pristine/thresholds.xml differ
Files opennms-etc-21.0.3-1/users.xml and opennms-etc-21.0.3-1-pristine/users.xml differ
Files opennms-etc-21.0.3-1/viewsdisplay.xml and opennms-etc-21.0.3-1-pristine/viewsdisplay.xml differ
```
