package com.example.jdagnogo.alertlebonsoinappart.services.jobs;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;
import com.evernote.android.job.JobManager;

public class DemoJobCreator implements JobCreator {

    @Override
    public Job create(String tag) {
        switch (tag) {
            case GetLastAppartJob.TAG:
                return new GetLastAppartJob();
            default:
                return null;
        }
    }

    public void cancelJob(int jobId) {
        JobManager.instance().cancel(jobId);
    }

}