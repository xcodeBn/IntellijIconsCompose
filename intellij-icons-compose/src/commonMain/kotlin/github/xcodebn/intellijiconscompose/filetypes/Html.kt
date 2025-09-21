package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Html: ImageVector
    get() {
        if (_Html != null) return _Html!!

        _Html = ImageVector.Builder(
            name = "Html",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(1f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 9f)
                lineTo(1f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(0f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 0f)
                lineTo(4f, 0f)
                lineTo(4f, 5f)
                lineTo(3f, 5f)
                lineTo(3f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 5f)
                lineTo(0f, 5f)
                close()
            }
        }.build()

        return _Html!!
    }

private var _Html: ImageVector? = null

