package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tbhidden: ImageVector
    get() {
        if (_Tbhidden != null) return _Tbhidden!!

        _Tbhidden = ImageVector.Builder(
            name = "Tbhidden",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                lineTo(12f, 0f)
                lineTo(12f, 10f)
                lineTo(2f, 10f)
                lineTo(2f, 0f)
                close()
                moveTo(3f, 1f)
                lineTo(3f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 1f)
                lineTo(3f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2f)
                lineTo(1f, 11f)
                lineTo(10f, 11f)
                lineTo(10f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 2f)
                lineTo(1f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(2f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 10f)
                    lineTo(2f, 10f)
                    lineTo(2f, 0f)
                    close()
                    moveTo(3f, 1f)
                    lineTo(3f, 9f)
                    lineTo(11f, 9f)
                    lineTo(11f, 1f)
                    lineTo(3f, 1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(1f, 2f)
                    lineTo(1f, 11f)
                    lineTo(10f, 11f)
                    lineTo(10f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 2f)
                    lineTo(1f, 2f)
                    close()
                }
            }
        }.build()

        return _Tbhidden!!
    }

private var _Tbhidden: ImageVector? = null

