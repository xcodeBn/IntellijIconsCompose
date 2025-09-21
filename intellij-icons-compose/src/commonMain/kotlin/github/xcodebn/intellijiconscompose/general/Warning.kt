package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Warning: ImageVector
    get() {
        if (_Warning != null) return _Warning!!

        _Warning = ImageVector.Builder(
            name = "Warning",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2f)
                lineTo(15f, 14f)
                lineTo(1f, 14f)
                lineTo(8f, 2f)
                close()
                moveTo(9f, 13f)
                lineTo(9f, 11f)
                lineTo(7f, 11f)
                lineTo(7f, 13f)
                lineTo(9f, 13f)
                close()
                moveTo(9f, 10f)
                lineTo(9f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 10f)
                lineTo(9f, 10f)
                close()
            }
        }.build()

        return _Warning!!
    }

private var _Warning: ImageVector? = null

