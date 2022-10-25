package com.lyb.jetpackworkmanagerstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * tips:定义工作后，必须使用 WorkManager 服务进行调度该工作才能运行。对于如何调度工作，WorkManager 提供了很大的灵活性。
     * 您可以将其安排为在某段时间内定期运行，也可以将其安排为仅运行一次。
     *
     * tips:不论您选择以何种方式调度工作，请始终使用 WorkRequest。Worker 定义工作单元，WorkRequest（及其子类）则定义工作运行方式和时间。
     * 在最简单的情况下，您可以使用 OneTimeWorkRequest，如以下示例所示。
     *
     *
     * 执行work的方法
     * 创建work请求，并将work请求提交给系统执行
     */
    private void doWorkRequest(Context context){
        //创建 WorkRequest
        WorkRequest uploadWorkRequest =
                new OneTimeWorkRequest.Builder(UploadWorker.class)
                        .build();

        //将 WorkRequest 提交给系统
        WorkManager
                .getInstance(context)
                .enqueue(uploadWorkRequest);

    }
}