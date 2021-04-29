# SmsInfoJob

www.smsinfojob.com

![geil (1)](https://user-images.githubusercontent.com/21340962/116579183-6e4d5780-a912-11eb-86c9-a488e4e68518.gif)


<div style="background: #202020; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%"> 1
 2
 3
 4
 5
 6
 7
 8
 9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59</pre></td><td><pre style="margin: 0; line-height: 125%"><span style="color: #6ab825; font-weight: bold">package</span> <span style="color: #d0d0d0">de.</span><span style="color: #bbbbbb">sms</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">info</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">job</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">smsinfojob</span><span style="color: #d0d0d0">;</span>

<span style="color: #6ab825; font-weight: bold">import</span> <span style="color: #447fcf; text-decoration: underline">java.io.BufferedReader</span><span style="color: #d0d0d0">;</span>
<span style="color: #6ab825; font-weight: bold">import</span> <span style="color: #447fcf; text-decoration: underline">java.io.InputStreamReader</span><span style="color: #d0d0d0">;</span>
<span style="color: #6ab825; font-weight: bold">import</span> <span style="color: #447fcf; text-decoration: underline">java.io.OutputStreamWriter</span><span style="color: #d0d0d0">;</span>
<span style="color: #6ab825; font-weight: bold">import</span> <span style="color: #447fcf; text-decoration: underline">java.net.URL</span><span style="color: #d0d0d0">;</span>
<span style="color: #6ab825; font-weight: bold">import</span> <span style="color: #447fcf; text-decoration: underline">java.net.URLConnection</span><span style="color: #d0d0d0">;</span>
<span style="color: #6ab825; font-weight: bold">import</span> <span style="color: #447fcf; text-decoration: underline">com.google.gson.Gson</span><span style="color: #d0d0d0">;</span>

<span style="color: #6ab825; font-weight: bold">public</span> <span style="color: #6ab825; font-weight: bold">class</span> <span style="color: #447fcf; text-decoration: underline">SmsInfoJob</span>

<span style="color: #d0d0d0">{</span>
	<span style="color: #ffa500">@SuppressWarnings</span><span style="color: #d0d0d0">(</span><span style="color: #ed9d13">&quot;unused&quot;</span><span style="color: #d0d0d0">)</span>
	<span style="color: #6ab825; font-weight: bold">public</span> <span style="color: #6ab825; font-weight: bold">static</span> <span style="color: #6ab825; font-weight: bold">void</span> <span style="color: #447fcf">main</span><span style="color: #d0d0d0">(String[]</span> <span style="color: #d0d0d0">args)</span> <span style="color: #6ab825; font-weight: bold">throws</span> <span style="color: #d0d0d0">Exception</span> <span style="color: #d0d0d0">{</span>
		<span style="color: #d0d0d0">URL</span> <span style="color: #d0d0d0">urlHttps</span> <span style="color: #d0d0d0">=</span> <span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">URL(</span><span style="color: #ed9d13">&quot;https://smsinfojob.com:9445/Menu/api/smsinfo/sendMessage&quot;</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">URL</span> <span style="color: #d0d0d0">urlHttp</span> <span style="color: #d0d0d0">=</span> <span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">URL(</span><span style="color: #ed9d13">&quot;http://smsinfojob.com:8080/Menu/api/smsinfo/sendMessage&quot;</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">Gson</span> <span style="color: #d0d0d0">javaToJson</span> <span style="color: #d0d0d0">=</span> <span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">Gson();</span>
		
		<span style="color: #d0d0d0">Message</span> <span style="color: #d0d0d0">aMessage</span> <span style="color: #d0d0d0">=</span> <span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">Message();</span>
		<span style="color: #d0d0d0">aMessage.</span><span style="color: #bbbbbb">setToNumber</span><span style="color: #d0d0d0">(</span><span style="color: #ed9d13">&quot;+4945678967&quot;</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">aMessage.</span><span style="color: #bbbbbb">setMessage</span><span style="color: #d0d0d0">(</span><span style="color: #ed9d13">&quot;Hello Client!&quot;</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">aMessage.</span><span style="color: #bbbbbb">setApiKey</span><span style="color: #d0d0d0">(</span><span style="color: #ed9d13">&quot;access#xxxxxxxxxx&quot;</span><span style="color: #d0d0d0">);</span> <span style="color: #999999; font-style: italic">// Your API Key</span>
		
		<span style="color: #d0d0d0">URLConnection</span> <span style="color: #d0d0d0">connection</span> <span style="color: #d0d0d0">=</span> <span style="color: #d0d0d0">urlHttps.</span><span style="color: #bbbbbb">openConnection</span><span style="color: #d0d0d0">();</span>
		<span style="color: #d0d0d0">connection.</span><span style="color: #bbbbbb">setDoOutput</span><span style="color: #d0d0d0">(</span><span style="color: #6ab825; font-weight: bold">true</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">connection.</span><span style="color: #bbbbbb">setRequestProperty</span><span style="color: #d0d0d0">(</span><span style="color: #ed9d13">&quot;Content-Type&quot;</span><span style="color: #d0d0d0">,</span> <span style="color: #ed9d13">&quot;application/json&quot;</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">connection.</span><span style="color: #bbbbbb">setConnectTimeout</span><span style="color: #d0d0d0">(</span><span style="color: #3677a9">5000</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">connection.</span><span style="color: #bbbbbb">setReadTimeout</span><span style="color: #d0d0d0">(</span><span style="color: #3677a9">5000</span><span style="color: #d0d0d0">);</span>
		<span style="color: #d0d0d0">OutputStreamWriter</span> <span style="color: #d0d0d0">out</span> <span style="color: #d0d0d0">=</span> <span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">OutputStreamWriter(connection.</span><span style="color: #bbbbbb">getOutputStream</span><span style="color: #d0d0d0">());</span>
		<span style="color: #d0d0d0">out.</span><span style="color: #bbbbbb">write</span><span style="color: #d0d0d0">(javaToJson.</span><span style="color: #bbbbbb">toJson</span><span style="color: #d0d0d0">(aMessage).</span><span style="color: #bbbbbb">toString</span><span style="color: #d0d0d0">());</span>
		<span style="color: #d0d0d0">out.</span><span style="color: #bbbbbb">close</span><span style="color: #d0d0d0">();</span>

		<span style="color: #d0d0d0">BufferedReader</span> <span style="color: #d0d0d0">in</span> <span style="color: #d0d0d0">=</span> <span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">BufferedReader(</span><span style="color: #6ab825; font-weight: bold">new</span> <span style="color: #d0d0d0">InputStreamReader(connection.</span><span style="color: #bbbbbb">getInputStream</span><span style="color: #d0d0d0">()));</span>
		<span style="color: #d0d0d0">String</span> <span style="color: #d0d0d0">line;</span>
		<span style="color: #6ab825; font-weight: bold">while</span> <span style="color: #d0d0d0">((line</span> <span style="color: #d0d0d0">=</span> <span style="color: #d0d0d0">in.</span><span style="color: #bbbbbb">readLine</span><span style="color: #d0d0d0">())</span> <span style="color: #d0d0d0">!=</span> <span style="color: #6ab825; font-weight: bold">null</span><span style="color: #d0d0d0">)</span> <span style="color: #d0d0d0">{</span>
			<span style="color: #d0d0d0">System.</span><span style="color: #bbbbbb">out</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">println</span><span style="color: #d0d0d0">(line);</span>
		<span style="color: #d0d0d0">}</span>
		<span style="color: #d0d0d0">in.</span><span style="color: #bbbbbb">close</span><span style="color: #d0d0d0">();</span>
	<span style="color: #d0d0d0">}</span>

	<span style="color: #ffa500">@SuppressWarnings</span><span style="color: #d0d0d0">(</span><span style="color: #ed9d13">&quot;unused&quot;</span><span style="color: #d0d0d0">)</span>
	<span style="color: #6ab825; font-weight: bold">private</span> <span style="color: #6ab825; font-weight: bold">static</span> <span style="color: #6ab825; font-weight: bold">class</span> <span style="color: #447fcf; text-decoration: underline">Message</span> <span style="color: #d0d0d0">{</span>
		<span style="color: #d0d0d0">String</span> <span style="color: #d0d0d0">toNumber;</span>
		<span style="color: #d0d0d0">String</span> <span style="color: #d0d0d0">message;</span>
		<span style="color: #d0d0d0">String</span> <span style="color: #d0d0d0">apiKey;</span>

		<span style="color: #6ab825; font-weight: bold">public</span> <span style="color: #6ab825; font-weight: bold">void</span> <span style="color: #447fcf">setApiKey</span><span style="color: #d0d0d0">(String</span> <span style="color: #d0d0d0">apiKey)</span> <span style="color: #d0d0d0">{</span>
			<span style="color: #6ab825; font-weight: bold">this</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">apiKey</span> <span style="color: #d0d0d0">=</span> <span style="color: #d0d0d0">apiKey;</span>
		<span style="color: #d0d0d0">}</span>

		<span style="color: #6ab825; font-weight: bold">public</span> <span style="color: #6ab825; font-weight: bold">void</span> <span style="color: #447fcf">setToNumber</span><span style="color: #d0d0d0">(String</span> <span style="color: #d0d0d0">toNumber)</span> <span style="color: #d0d0d0">{</span>
			<span style="color: #6ab825; font-weight: bold">this</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">toNumber</span> <span style="color: #d0d0d0">=</span> <span style="color: #d0d0d0">toNumber;</span>
		<span style="color: #d0d0d0">}</span>

		<span style="color: #6ab825; font-weight: bold">public</span> <span style="color: #6ab825; font-weight: bold">void</span> <span style="color: #447fcf">setMessage</span><span style="color: #d0d0d0">(String</span> <span style="color: #d0d0d0">message)</span> <span style="color: #d0d0d0">{</span>
			<span style="color: #6ab825; font-weight: bold">this</span><span style="color: #d0d0d0">.</span><span style="color: #bbbbbb">message</span> <span style="color: #d0d0d0">=</span> <span style="color: #d0d0d0">message;</span>
		<span style="color: #d0d0d0">}</span>
	<span style="color: #d0d0d0">}</span>
<span style="color: #d0d0d0">}</span>
</pre></td></tr></table></div>
