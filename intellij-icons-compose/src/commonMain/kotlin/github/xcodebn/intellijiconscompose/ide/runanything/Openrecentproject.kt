package github.xcodebn.intellijiconscompose.ide.runanything

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Openrecentproject: ImageVector
    get() {
        if (_Openrecentproject != null) return _Openrecentproject!!

        _Openrecentproject = ImageVector.Builder(
            name = "Openrecentproject",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 7f)
                lineTo(2f, 11f)
                lineTo(2f, 7f)
                lineTo(2f, 5f)
                lineTo(2f, 3f)
                lineTo(7f, 3f)
                lineTo(8f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 7f)
                lineTo(4f, 7f)
                close()
                moveTo(5f, 8f)
                lineTo(16f, 8f)
                lineTo(13f, 13f)
                lineTo(2f, 13f)
                lineTo(5f, 8f)
                close()
            }
        }.build()

        return _Openrecentproject!!
    }

private var _Openrecentproject: ImageVector? = null

