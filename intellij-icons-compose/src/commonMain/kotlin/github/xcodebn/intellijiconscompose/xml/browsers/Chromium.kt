package github.xcodebn.intellijiconscompose.xml.browsers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chromium: ImageVector
    get() {
        if (_Chromium != null) return _Chromium!!

        _Chromium = ImageVector.Builder(
            name = "Chromium",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3468DA))
            ) {
                moveTo(0f, 0f)
                lineTo(0f, 10f)
                lineTo(4f, 10f)
                lineTo(7f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(0f, 0f)
                lineTo(0f, 10f)
                lineTo(4f, 10f)
                lineTo(7f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 15f)
                lineTo(7f, 15f)
                lineTo(11f, 11f)
                lineTo(11f, 9f)
                lineTo(5f, 9f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA0C1FC))
            ) {
                moveTo(0f, 0f)
                lineTo(3f, 5f)
                lineTo(0f, 10f)
                lineTo(8f, 10f)
                lineTo(8f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(0f, 0f)
                lineTo(4f, 5f)
                lineTo(0f, 10f)
                lineTo(9f, 10f)
                lineTo(9f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(8f, 4f)
                lineTo(8f, 6f)
                lineTo(14f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(1f, 3f)
                lineTo(6f, 7f)
                lineTo(4f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(6f, 14f)
                lineTo(8f, 8f)
                lineTo(10f, 9f)
                close()
            }
        }.build()

        return _Chromium!!
    }

private var _Chromium: ImageVector? = null

