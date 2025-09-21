package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regex: ImageVector
    get() {
        if (_Regex != null) return _Regex!!

        _Regex = ImageVector.Builder(
            name = "Regex",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(10f, 6f)
                lineTo(12f, 4f)
                lineTo(13f, 6f)
                lineTo(11f, 7f)
                lineTo(13f, 8f)
                lineTo(12f, 10f)
                lineTo(10f, 8f)
                lineTo(10f, 11f)
                lineTo(8f, 11f)
                lineTo(8f, 8f)
                lineTo(6f, 10f)
                lineTo(5f, 8f)
                lineTo(7f, 7f)
                lineTo(5f, 6f)
                lineTo(6f, 4f)
                lineTo(8f, 6f)
                lineTo(8f, 3f)
                lineTo(10f, 3f)
                lineTo(10f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91))
                ) {
                    moveTo(10f, 6f)
                    lineTo(12f, 4f)
                    lineTo(13f, 6f)
                    lineTo(11f, 7f)
                    lineTo(13f, 8f)
                    lineTo(12f, 10f)
                    lineTo(10f, 8f)
                    lineTo(10f, 11f)
                    lineTo(8f, 11f)
                    lineTo(8f, 8f)
                    lineTo(6f, 10f)
                    lineTo(5f, 8f)
                    lineTo(7f, 7f)
                    lineTo(5f, 6f)
                    lineTo(6f, 4f)
                    lineTo(8f, 6f)
                    lineTo(8f, 3f)
                    lineTo(10f, 3f)
                    lineTo(10f, 6f)
                    close()
                }
            }
        }.build()

        return _Regex!!
    }

private var _Regex: ImageVector? = null

