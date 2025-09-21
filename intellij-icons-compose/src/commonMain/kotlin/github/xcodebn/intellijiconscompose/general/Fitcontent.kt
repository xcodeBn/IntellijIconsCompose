package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fitcontent: ImageVector
    get() {
        if (_Fitcontent != null) return _Fitcontent!!

        _Fitcontent = ImageVector.Builder(
            name = "Fitcontent",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(1f, 2f)
                lineTo(15f, 2f)
                lineTo(15f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 2f)
                close()
                moveTo(2f, 4f)
                lineTo(2f, 12f)
                lineTo(14f, 12f)
                lineTo(14f, 4f)
                lineTo(2f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(1f, 2f)
                    lineTo(15f, 2f)
                    lineTo(15f, 14f)
                    lineTo(1f, 14f)
                    lineTo(1f, 2f)
                    close()
                    moveTo(2f, 4f)
                    lineTo(2f, 12f)
                    lineTo(14f, 12f)
                    lineTo(14f, 4f)
                    lineTo(2f, 4f)
                    close()
                }
            }
        }.build()

        return _Fitcontent!!
    }

private var _Fitcontent: ImageVector? = null

