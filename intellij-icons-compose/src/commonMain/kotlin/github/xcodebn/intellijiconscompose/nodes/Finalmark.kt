package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Finalmark: ImageVector
    get() {
        if (_Finalmark != null) return _Finalmark!!

        _Finalmark = ImageVector.Builder(
            name = "Finalmark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                lineTo(5f, 3f)
                curveTo(4.55f, 3.68f, 4.36f, 3.92f, 4.14f, 4.14f)
                curveTo(3.92f, 4.36f, 3.68f, 4.55f, 3.45f, 4.72f)
                lineTo(6f, 6f)
                close()
                moveTo(4f, 0f)
                curveTo(5.08f, 0.84f, 4.60f, 2.26f, 3.43f, 3.43f)
                curveTo(2.26f, 4.60f, 0.84f, 5.08f, 0.25f, 4.49f)
                curveTo(-0.34f, 3.91f, 0.14f, 2.48f, 1.31f, 1.31f)
                curveTo(2.48f, 0.14f, 3.91f, -0.34f, 4.49f, 0.25f)
                close()
            }
        }.build()

        return _Finalmark!!
    }

private var _Finalmark: ImageVector? = null

