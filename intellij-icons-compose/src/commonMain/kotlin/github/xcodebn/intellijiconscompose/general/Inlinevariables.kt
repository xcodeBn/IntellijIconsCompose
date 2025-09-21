package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlinevariables: ImageVector
    get() {
        if (_Inlinevariables != null) return _Inlinevariables!!

        _Inlinevariables = ImageVector.Builder(
            name = "Inlinevariables",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 1f)
                lineTo(14f, 1f)
                lineTo(14f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 1f)
                close()
                moveTo(5f, 3f)
                lineTo(5f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 3f)
                lineTo(5f, 3f)
                close()
                moveTo(6f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 5f)
                close()
                moveTo(6f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 8f)
                lineTo(6f, 8f)
                lineTo(6f, 7f)
                close()
                moveTo(6f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 9f)
                close()
            }
        }.build()

        return _Inlinevariables!!
    }

private var _Inlinevariables: ImageVector? = null

