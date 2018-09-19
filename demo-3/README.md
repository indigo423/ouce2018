# Demo 3

How to deal with configuration

```
# Start the service stack in background
docker-compose up -d
```

- Configuration files are persisted on the local file system in `opennms-etc`.
- Introducing opennms-etc-overlay and jetty-overlay directory.
- It makes sense to store configuruation files in the host file system cause you need to edit them manually
