package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Services: ImageVector
    get() {
        if (_Services != null) return _Services!!

        _Services = ImageVector.Builder(
            name = "Services",
            defaultWidth = 14.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 8f)
                lineTo(12f, 14f)
                lineTo(4f, 14f)
                lineTo(1f, 8f)
                lineTo(4f, 2f)
                lineTo(12f, 2f)
                lineTo(15f, 8f)
                close()
                moveTo(6f, 4f)
                lineTo(6f, 12f)
                lineTo(12f, 8f)
                lineTo(6f, 4f)
                close()
            }
        }.build()

        return _Services!!
    }

private var _Services: ImageVector? = null

