package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tbshown: ImageVector
    get() {
        if (_Tbshown != null) return _Tbshown!!

        _Tbshown = ImageVector.Builder(
            name = "Tbshown",
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
            }
        }.build()

        return _Tbshown!!
    }

private var _Tbshown: ImageVector? = null

