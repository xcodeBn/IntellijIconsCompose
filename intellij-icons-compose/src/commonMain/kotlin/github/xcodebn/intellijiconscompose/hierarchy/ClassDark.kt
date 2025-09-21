package github.xcodebn.intellijiconscompose.hierarchy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClassDark: ImageVector
    get() {
        if (_ClassDark != null) return _ClassDark!!

        _ClassDark = ImageVector.Builder(
            name = "ClassDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _ClassDark!!
    }

private var _ClassDark: ImageVector? = null

