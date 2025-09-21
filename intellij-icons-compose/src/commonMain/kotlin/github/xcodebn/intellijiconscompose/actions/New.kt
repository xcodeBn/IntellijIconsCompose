package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val New: ImageVector
    get() {
        if (_New != null) return _New!!

        _New = ImageVector.Builder(
            name = "New",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 14f)
                lineTo(9f, 15f)
                lineTo(9f, 13f)
                lineTo(7f, 12f)
                lineTo(9f, 10f)
                lineTo(9f, 8f)
                lineTo(12f, 9f)
                lineTo(14f, 8f)
                lineTo(14f, 10f)
                lineTo(16f, 12f)
                lineTo(14f, 13f)
                lineTo(14f, 15f)
                close()
            }
        }.build()

        return _New!!
    }

private var _New: ImageVector? = null

