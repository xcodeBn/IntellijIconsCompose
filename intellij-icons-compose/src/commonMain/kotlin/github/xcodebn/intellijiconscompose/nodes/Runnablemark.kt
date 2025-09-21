package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Runnablemark: ImageVector
    get() {
        if (_Runnablemark != null) return _Runnablemark!!

        _Runnablemark = ImageVector.Builder(
            name = "Runnablemark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 7f)
                lineTo(16f, 4f)
                lineTo(16f, 3f)
                lineTo(11f, 0f)
                close()
            }
        }.build()

        return _Runnablemark!!
    }

private var _Runnablemark: ImageVector? = null

