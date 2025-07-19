"use client";

import { useEffect, useState } from "react";

export default function Greeting() {
  const [lang, setLang] = useState("kr");
  const [msg, setMsg] = useState("");

  useEffect(() => {
    if (!lang) return;

    fetch(`${process.env.NEXT_PUBLIC_API_URL}/greeting?lang=${lang}`)
      .then((res) => res.json())
      .then((data) => setMsg(data.message))
      .catch(() => setMsg("인사말 오류"));
  }, [lang]);

  return (
    <>
      <div>인사말</div>
      <label>언어선택</label>
      <select value={lang} onChange={(e) => setLang(e.target.value)}>
        <option>kr</option>
        <option>en</option>
        <option>jp</option>
      </select>
      <div>결과:{msg}</div>
    </>
  );
}
